.class public abstract Lcom/android/dx/dex/file/EncodedMember;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lcom/android/dx/util/ToHuman;


# instance fields
.field private final accessFlags:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/android/dx/dex/file/EncodedMember;->accessFlags:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract addContents(Lcom/android/dx/dex/file/DexFile;)V
.end method

.method public abstract debugPrint(Ljava/io/PrintWriter;Z)V
.end method

.method public abstract encode(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;II)I
.end method

.method public final getAccessFlags()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/EncodedMember;->accessFlags:I

    .line 2
    .line 3
    return p0
.end method

.method public abstract getName()Lcom/android/dx/rop/cst/CstString;
.end method
