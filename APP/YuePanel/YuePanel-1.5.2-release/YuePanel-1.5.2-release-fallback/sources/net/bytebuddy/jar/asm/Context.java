package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class Context {
    net.bytebuddy.jar.asm.Attribute[] attributePrototypes;
    char[] charBuffer;
    int currentFrameLocalCount;
    int currentFrameLocalCountDelta;
    java.lang.Object[] currentFrameLocalTypes;
    int currentFrameOffset;
    int currentFrameStackCount;
    java.lang.Object[] currentFrameStackTypes;
    int currentFrameType;
    net.bytebuddy.jar.asm.Label[] currentLocalVariableAnnotationRangeEnds;
    int[] currentLocalVariableAnnotationRangeIndices;
    net.bytebuddy.jar.asm.Label[] currentLocalVariableAnnotationRangeStarts;
    int currentMethodAccessFlags;
    java.lang.String currentMethodDescriptor;
    net.bytebuddy.jar.asm.Label[] currentMethodLabels;
    java.lang.String currentMethodName;
    int currentTypeAnnotationTarget;
    net.bytebuddy.jar.asm.TypePath currentTypeAnnotationTargetPath;
    int parsingOptions;

    public Context() {
            r0 = this;
            r0.<init>()
            return
    }
}
