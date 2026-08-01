.class public abstract Lcom/android/dx/cf/attrib/BaseAnnotations;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final annotations:Lcom/android/dx/rop/annotation/Annotations;

.field private final byteLength:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/dx/rop/annotation/Annotations;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p2}, Lcom/android/dx/util/MutabilityControl;->isMutable()Z

    .line 5
    .line 6
    .line 7
    move-result p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/cf/attrib/BaseAnnotations;->annotations:Lcom/android/dx/rop/annotation/Annotations;

    .line 11
    .line 12
    iput p3, p0, Lcom/android/dx/cf/attrib/BaseAnnotations;->byteLength:I

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    :try_start_1
    new-instance p0, Lcom/android/dx/util/MutabilityException;

    .line 16
    .line 17
    const-string p1, "annotations.isMutable()"

    .line 18
    .line 19
    invoke-direct {p0, p1}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p0
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 23
    :catch_0
    const-string p0, "annotations == null"

    .line 24
    .line 25
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method


# virtual methods
.method public final byteLength()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/attrib/BaseAnnotations;->byteLength:I

    .line 2
    .line 3
    add-int/lit8 p0, p0, 0x6

    .line 4
    .line 5
    return p0
.end method

.method public final getAnnotations()Lcom/android/dx/rop/annotation/Annotations;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/BaseAnnotations;->annotations:Lcom/android/dx/rop/annotation/Annotations;

    .line 2
    .line 3
    return-object p0
.end method
