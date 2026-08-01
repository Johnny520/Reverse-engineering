.class Lcom/android/dx/rop/code/RegisterSpec$ForComparison;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/rop/code/RegisterSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForComparison"
.end annotation


# instance fields
.field private local:Lcom/android/dx/rop/code/LocalItem;

.field private reg:I

.field private type:Lcom/android/dx/rop/type/TypeBearer;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/rop/code/RegisterSpec$1;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;-><init>()V

    return-void
.end method

.method public static synthetic access$100(Lcom/android/dx/rop/code/RegisterSpec$ForComparison;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->reg:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$200(Lcom/android/dx/rop/code/RegisterSpec$ForComparison;)Lcom/android/dx/rop/type/TypeBearer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300(Lcom/android/dx/rop/code/RegisterSpec$ForComparison;)Lcom/android/dx/rop/code/LocalItem;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    check-cast p1, Lcom/android/dx/rop/code/RegisterSpec;

    .line 8
    .line 9
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->reg:I

    .line 10
    .line 11
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 14
    .line 15
    invoke-static {p1, v0, v1, p0}, Lcom/android/dx/rop/code/RegisterSpec;->access$500(Lcom/android/dx/rop/code/RegisterSpec;ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->reg:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 6
    .line 7
    invoke-static {v0, v1, p0}, Lcom/android/dx/rop/code/RegisterSpec;->access$600(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public set(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->reg:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 6
    .line 7
    return-void
.end method

.method public toRegisterSpec()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 4

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    iget v1, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->reg:I

    .line 4
    .line 5
    iget-object v2, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->type:Lcom/android/dx/rop/type/TypeBearer;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;->local:Lcom/android/dx/rop/code/LocalItem;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v1, v2, p0, v3}, Lcom/android/dx/rop/code/RegisterSpec;-><init>(ILcom/android/dx/rop/type/TypeBearer;Lcom/android/dx/rop/code/LocalItem;Lcom/android/dx/rop/code/RegisterSpec$1;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
