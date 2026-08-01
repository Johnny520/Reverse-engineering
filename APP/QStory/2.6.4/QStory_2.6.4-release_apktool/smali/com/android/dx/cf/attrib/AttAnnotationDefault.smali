.class public final Lcom/android/dx/cf/attrib/AttAnnotationDefault;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "AnnotationDefault"


# instance fields
.field private final byteLength:I

.field private final value:Lcom/android/dx/rop/cst/Constant;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/Constant;I)V
    .locals 1

    .line 1
    const-string v0, "AnnotationDefault"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/cf/attrib/AttAnnotationDefault;->value:Lcom/android/dx/rop/cst/Constant;

    .line 9
    .line 10
    iput p2, p0, Lcom/android/dx/cf/attrib/AttAnnotationDefault;->byteLength:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "value == null"

    .line 14
    .line 15
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method


# virtual methods
.method public byteLength()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/attrib/AttAnnotationDefault;->byteLength:I

    .line 2
    .line 3
    add-int/lit8 p0, p0, 0x6

    .line 4
    .line 5
    return p0
.end method

.method public getValue()Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttAnnotationDefault;->value:Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    return-object p0
.end method
