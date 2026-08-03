package com.android.dex;

import com.android.dex.Dex;

/* JADX INFO: loaded from: classes.dex */
public final class Annotation implements Comparable<Annotation> {
    private final Dex dex;
    private final EncodedValue encodedAnnotation;
    private final byte visibility;

    public Annotation(Dex dex, byte b, EncodedValue encodedValue) {
        this.dex = dex;
        this.visibility = b;
        this.encodedAnnotation = encodedValue;
    }

    public EncodedValueReader getReader() {
        return new EncodedValueReader(this.encodedAnnotation, 29);
    }

    public int getTypeIndex() {
        EncodedValueReader reader = getReader();
        reader.readAnnotation();
        return reader.getAnnotationType();
    }

    public byte getVisibility() {
        return this.visibility;
    }

    public String toString() {
        if (this.dex == null) {
            return ((int) this.visibility) + " " + getTypeIndex();
        }
        return ((int) this.visibility) + " " + this.dex.typeNames().get(getTypeIndex());
    }

    public void writeTo(Dex.Section section) {
        section.writeByte(this.visibility);
        this.encodedAnnotation.writeTo(section);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(Annotation annotation) {
        return this.encodedAnnotation.compareTo(annotation.encodedAnnotation);
    }
}
