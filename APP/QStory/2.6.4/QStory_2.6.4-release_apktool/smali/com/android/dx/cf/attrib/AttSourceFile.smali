.class public final Lcom/android/dx/cf/attrib/AttSourceFile;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "SourceFile"


# instance fields
.field private final sourceFile:Lcom/android/dx/rop/cst/CstString;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstString;)V
    .locals 1

    .line 1
    const-string v0, "SourceFile"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/cf/attrib/AttSourceFile;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "sourceFile == null"

    .line 12
    .line 13
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method


# virtual methods
.method public byteLength()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public getSourceFile()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttSourceFile;->sourceFile:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method
