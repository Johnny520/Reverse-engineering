package com.android.p001dx.dex.file;

import com.android.p001dx.rop.annotation.Annotation;
import com.android.p001dx.rop.annotation.AnnotationVisibility;
import com.android.p001dx.rop.annotation.NameValuePair;
import com.android.p001dx.util.AnnotatedOutput;
import com.android.p001dx.util.ByteArrayAnnotatedOutput;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private static final TypeIdSorter TYPE_ID_SORTER = new TypeIdSorter(null);
    private static final int VISIBILITY_BUILD = 0;
    private static final int VISIBILITY_RUNTIME = 1;
    private static final int VISIBILITY_SYSTEM = 2;
    private final Annotation annotation;
    private byte[] encodedForm;
    private TypeIdItem type;

    /* JADX INFO: renamed from: com.android.dx.dex.file.AnnotationItem$1 */
    public static /* synthetic */ class C18191 {
        static final /* synthetic */ int[] $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility;

        static {
            int[] iArr = new int[AnnotationVisibility.values().length];
            $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility = iArr;
            try {
                iArr[AnnotationVisibility.BUILD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility[AnnotationVisibility.RUNTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility[AnnotationVisibility.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class TypeIdSorter implements Comparator<AnnotationItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private TypeIdSorter() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: com.android.dx.dex.file.AnnotationItem.TypeIdSorter.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ TypeIdSorter(C18191 c18191) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        public int compare(AnnotationItem annotationItem, AnnotationItem annotationItem2) {
            int index = annotationItem.type.getIndex();
            int index2 = annotationItem2.type.getIndex();
            if (index < index2) {
                return -1;
            }
            return index > index2 ? 1 : 0;
        }
    }

    public AnnotationItem(Annotation annotation, DexFile dexFile) {
        super(1, -1);
        if (annotation == null) {
            throw new NullPointerException("annotation == null");
        }
        this.annotation = annotation;
        this.type = null;
        this.encodedForm = null;
        addContents(dexFile);
    }

    public static void sortByTypeIdIndex(AnnotationItem[] annotationItemArr) {
        Arrays.sort(annotationItemArr, TYPE_ID_SORTER);
    }

    @Override // com.android.p001dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        this.type = dexFile.getTypeIds().intern(this.annotation.getType());
        ValueEncoder.addContents(dexFile, this.annotation);
    }

    public void annotateTo(AnnotatedOutput annotatedOutput, String str) {
        annotatedOutput.annotate(0, str + "visibility: " + this.annotation.getVisibility().toHuman());
        annotatedOutput.annotate(0, str + "type: " + this.annotation.getType().toHuman());
        for (NameValuePair nameValuePair : this.annotation.getNameValuePairs()) {
            annotatedOutput.annotate(0, str + nameValuePair.getName().toHuman() + ": " + ValueEncoder.constantToHuman(nameValuePair.getValue()));
        }
    }

    @Override // com.android.p001dx.dex.file.OffsettedItem
    public int compareTo0(OffsettedItem offsettedItem) {
        return this.annotation.compareTo(((AnnotationItem) offsettedItem).annotation);
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    @Override // com.android.p001dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_ITEM;
    }

    @Override // com.android.p001dx.dex.file.OffsettedItem
    public void place0(Section section, int i) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        new ValueEncoder(section.getFile(), byteArrayAnnotatedOutput).writeAnnotation(this.annotation, false);
        byte[] byteArray = byteArrayAnnotatedOutput.toByteArray();
        this.encodedForm = byteArray;
        setWriteSize(byteArray.length + 1);
    }

    @Override // com.android.p001dx.dex.file.OffsettedItem
    public String toHuman() {
        return this.annotation.toHuman();
    }

    @Override // com.android.p001dx.dex.file.OffsettedItem
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        boolean zAnnotates = annotatedOutput.annotates();
        AnnotationVisibility visibility = this.annotation.getVisibility();
        if (zAnnotates) {
            annotatedOutput.annotate(0, offsetString() + " annotation");
            annotatedOutput.annotate(1, "  visibility: VISBILITY_" + visibility);
        }
        int i = C18191.$SwitchMap$com$android$dx$rop$annotation$AnnotationVisibility[visibility.ordinal()];
        if (i == 1) {
            annotatedOutput.writeByte(0);
        } else if (i == 2) {
            annotatedOutput.writeByte(1);
        } else {
            if (i != 3) {
                throw new RuntimeException("shouldn't happen");
            }
            annotatedOutput.writeByte(2);
        }
        if (zAnnotates) {
            new ValueEncoder(dexFile, annotatedOutput).writeAnnotation(this.annotation, true);
        } else {
            annotatedOutput.write(this.encodedForm);
        }
    }
}
