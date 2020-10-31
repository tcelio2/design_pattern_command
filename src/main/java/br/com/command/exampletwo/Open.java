package br.com.command.exampletwo;

public class Open implements Operation {
    private TextFile textFile;

    public Open(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
