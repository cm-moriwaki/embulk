package org.embulk.spi;

public interface FileInput
        extends AutoCloseable
{
    boolean nextFile();

    Buffer poll();

    void close();

    public default String getName() {
        return null;
    }
}
