package br.com.command.exampletwo;

public class Save implements Operation {
    private TextFile textFile;

    public Save(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
