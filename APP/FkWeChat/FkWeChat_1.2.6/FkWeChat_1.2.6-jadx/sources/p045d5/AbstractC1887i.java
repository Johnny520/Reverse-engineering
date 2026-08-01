package p045d5;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: d5.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1887i {

    /* JADX INFO: renamed from: a */
    public static final int[] f5247a = new int[256];

    /* JADX INFO: renamed from: b */
    public static final String[] f5248b = new String[256];

    static {
        int i10;
        int i11 = 0;
        while (i11 < 2498) {
            int i12 = 16;
            int iDigit = (Character.digit("00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;".charAt(i11), 16) << 4) | Character.digit("00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;".charAt(i11 + 1), 16);
            char cCharAt = "00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;".charAt(i11 + 3);
            if (cCharAt == '-') {
                i12 = 1;
            } else if (cCharAt == 'I') {
                i12 = 13;
            } else if (cCharAt == 'W') {
                i12 = 19;
            } else if (cCharAt == 'p') {
                i12 = 9;
            } else if (cCharAt == 'y') {
                i12 = 12;
            } else if (cCharAt == 'L') {
                i12 = 14;
            } else if (cCharAt == 'M') {
                i12 = 18;
            } else if (cCharAt == 'b') {
                i12 = 7;
            } else if (cCharAt == 'c') {
                i12 = 8;
            } else if (cCharAt == 'l') {
                i12 = 10;
            } else if (cCharAt != 'm') {
                switch (cCharAt) {
                    case '0':
                        i12 = 2;
                        break;
                    case '1':
                        i12 = 3;
                        break;
                    case Opcodes.AALOAD /* 50 */:
                        i12 = 4;
                        break;
                    case Opcodes.BALOAD /* 51 */:
                        i12 = 5;
                        break;
                    case '4':
                        i12 = 6;
                        break;
                    default:
                        switch (cCharAt) {
                            case Opcodes.AASTORE /* 83 */:
                                i12 = 15;
                                break;
                            case Opcodes.BASTORE /* 84 */:
                                break;
                            case Opcodes.CASTORE /* 85 */:
                                i12 = 17;
                                break;
                            default:
                                i12 = 0;
                                break;
                        }
                        break;
                }
            } else {
                i12 = 11;
            }
            int i13 = i11 + 5;
            if ("00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;".charAt(i11 + 4) == ':') {
                while (true) {
                    char cCharAt2 = "00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;".charAt(i13);
                    if (cCharAt2 == 'D') {
                        i10 = i12 | 256;
                    } else if (cCharAt2 == 'F') {
                        i10 = i12 | 64;
                    } else if (cCharAt2 == 'c') {
                        i10 = i12 | 512;
                    } else if (cCharAt2 == 'f') {
                        i10 = i12 | 2048;
                    } else if (cCharAt2 == 'i') {
                        i10 = i12 | 8192;
                    } else if (cCharAt2 == 'm') {
                        i10 = i12 | 4096;
                    } else if (cCharAt2 == 's') {
                        i10 = i12 | 1024;
                    } else if (cCharAt2 == 'I') {
                        i10 = i12 | 32;
                    } else if (cCharAt2 != 'J') {
                        i13++;
                    } else {
                        i10 = i12 | 128;
                    }
                    i12 = i10;
                    i13++;
                }
            }
            int iIndexOf = "00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;".indexOf(59, i13);
            f5247a[iDigit] = i12;
            f5248b[iDigit] = "00 - nop;01 - aconst_null;02 - iconst_m1;03 - iconst_0;04 - iconst_1;05 - iconst_2;06 - iconst_3;07 - iconst_4;08 - iconst_5;09 - lconst_0;0a - lconst_1;0b - fconst_0;0c - fconst_1;0d - fconst_2;0e - dconst_0;0f - dconst_1;10 y bipush;11 S sipush;12 L:IFcs ldc;13 p:IFcs ldc_w;14 p:DJ ldc2_w;15 l iload;16 m lload;17 l fload;18 m dload;19 l aload;1a 0 iload_0;1b 1 iload_1;1c 2 iload_2;1d 3 iload_3;1e 1 lload_0;1f 2 lload_1;20 3 lload_2;21 4 lload_3;22 0 fload_0;23 1 fload_1;24 2 fload_2;25 3 fload_3;26 1 dload_0;27 2 dload_1;28 3 dload_2;29 4 dload_3;2a 0 aload_0;2b 1 aload_1;2c 2 aload_2;2d 3 aload_3;2e - iaload;2f - laload;30 - faload;31 - daload;32 - aaload;33 - baload;34 - caload;35 - saload;36 - istore;37 - lstore;38 - fstore;39 - dstore;3a - astore;3b 0 istore_0;3c 1 istore_1;3d 2 istore_2;3e 3 istore_3;3f 1 lstore_0;40 2 lstore_1;41 3 lstore_2;42 4 lstore_3;43 0 fstore_0;44 1 fstore_1;45 2 fstore_2;46 3 fstore_3;47 1 dstore_0;48 2 dstore_1;49 3 dstore_2;4a 4 dstore_3;4b 0 astore_0;4c 1 astore_1;4d 2 astore_2;4e 3 astore_3;4f - iastore;50 - lastore;51 - fastore;52 - dastore;53 - aastore;54 - bastore;55 - castore;56 - sastore;57 - pop;58 - pop2;59 - dup;5a - dup_x1;5b - dup_x2;5c - dup2;5d - dup2_x1;5e - dup2_x2;5f - swap;60 - iadd;61 - ladd;62 - fadd;63 - dadd;64 - isub;65 - lsub;66 - fsub;67 - dsub;68 - imul;69 - lmul;6a - fmul;6b - dmul;6c - idiv;6d - ldiv;6e - fdiv;6f - ddiv;70 - irem;71 - lrem;72 - frem;73 - drem;74 - ineg;75 - lneg;76 - fneg;77 - dneg;78 - ishl;79 - lshl;7a - ishr;7b - lshr;7c - iushr;7d - lushr;7e - iand;7f - land;80 - ior;81 - lor;82 - ixor;83 - lxor;84 l iinc;85 - i2l;86 - i2f;87 - i2d;88 - l2i;89 - l2f;8a - l2d;8b - f2i;8c - f2l;8d - f2d;8e - d2i;8f - d2l;90 - d2f;91 - i2b;92 - i2c;93 - i2s;94 - lcmp;95 - fcmpl;96 - fcmpg;97 - dcmpl;98 - dcmpg;99 b ifeq;9a b ifne;9b b iflt;9c b ifge;9d b ifgt;9e b ifle;9f b if_icmpeq;a0 b if_icmpne;a1 b if_icmplt;a2 b if_icmpge;a3 b if_icmpgt;a4 b if_icmple;a5 b if_acmpeq;a6 b if_acmpne;a7 b goto;a8 b jsr;a9 l ret;aa T tableswitch;ab U lookupswitch;ac - ireturn;ad - lreturn;ae - freturn;af - dreturn;b0 - areturn;b1 - return;b2 p:f getstatic;b3 p:f putstatic;b4 p:f getfield;b5 p:f putfield;b6 p:m invokevirtual;b7 p:m invokespecial;b8 p:m invokestatic;b9 I:i invokeinterface;bb p:c new;bc y newarray;bd p:c anewarray;be - arraylength;bf - athrow;c0 p:c checkcast;c1 p:c instanceof;c2 - monitorenter;c3 - monitorexit;c4 W wide;c5 M:c multianewarray;c6 b ifnull;c7 b ifnonnull;c8 c goto_w;c9 c jsr_w;".substring(i13, iIndexOf);
            i11 = iIndexOf + 1;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m6736a(int i10) {
        return f5247a[i10];
    }

    /* JADX INFO: renamed from: b */
    public static String m6737b(int i10) {
        String[] strArr = f5248b;
        String str = strArr[i10];
        if (str != null) {
            return str;
        }
        String str2 = "unused_" + AbstractC8826h.m33897f(i10);
        strArr[i10] = str2;
        return str2;
    }
}
