.class public final enum Lcom/bumptech/glide/MemoryCategory;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bumptech/glide/MemoryCategory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/bumptech/glide/MemoryCategory;

.field public static final enum HIGH:Lcom/bumptech/glide/MemoryCategory;

.field public static final enum LOW:Lcom/bumptech/glide/MemoryCategory;

.field public static final enum NORMAL:Lcom/bumptech/glide/MemoryCategory;

.field public static final enum ZERO:Lcom/bumptech/glide/MemoryCategory;


# instance fields
.field private final multiplier:F


# direct methods
.method private static synthetic $values()[Lcom/bumptech/glide/MemoryCategory;
    .locals 4

    .line 1
    sget-object v0, Lcom/bumptech/glide/MemoryCategory;->ZERO:Lcom/bumptech/glide/MemoryCategory;

    .line 2
    .line 3
    sget-object v1, Lcom/bumptech/glide/MemoryCategory;->LOW:Lcom/bumptech/glide/MemoryCategory;

    .line 4
    .line 5
    sget-object v2, Lcom/bumptech/glide/MemoryCategory;->NORMAL:Lcom/bumptech/glide/MemoryCategory;

    .line 6
    .line 7
    sget-object v3, Lcom/bumptech/glide/MemoryCategory;->HIGH:Lcom/bumptech/glide/MemoryCategory;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/bumptech/glide/MemoryCategory;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/bumptech/glide/MemoryCategory;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "ZERO"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, Lcom/bumptech/glide/MemoryCategory;-><init>(Ljava/lang/String;IF)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/bumptech/glide/MemoryCategory;->ZERO:Lcom/bumptech/glide/MemoryCategory;

    .line 11
    .line 12
    new-instance v0, Lcom/bumptech/glide/MemoryCategory;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    const/high16 v2, 0x3f000000    # 0.5f

    .line 16
    .line 17
    const-string v3, "LOW"

    .line 18
    .line 19
    invoke-direct {v0, v3, v1, v2}, Lcom/bumptech/glide/MemoryCategory;-><init>(Ljava/lang/String;IF)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lcom/bumptech/glide/MemoryCategory;->LOW:Lcom/bumptech/glide/MemoryCategory;

    .line 23
    .line 24
    new-instance v0, Lcom/bumptech/glide/MemoryCategory;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const/high16 v2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    const-string v3, "NORMAL"

    .line 30
    .line 31
    invoke-direct {v0, v3, v1, v2}, Lcom/bumptech/glide/MemoryCategory;-><init>(Ljava/lang/String;IF)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/bumptech/glide/MemoryCategory;->NORMAL:Lcom/bumptech/glide/MemoryCategory;

    .line 35
    .line 36
    new-instance v0, Lcom/bumptech/glide/MemoryCategory;

    .line 37
    .line 38
    const/4 v1, 0x3

    .line 39
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 40
    .line 41
    const-string v3, "HIGH"

    .line 42
    .line 43
    invoke-direct {v0, v3, v1, v2}, Lcom/bumptech/glide/MemoryCategory;-><init>(Ljava/lang/String;IF)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lcom/bumptech/glide/MemoryCategory;->HIGH:Lcom/bumptech/glide/MemoryCategory;

    .line 47
    .line 48
    invoke-static {}, Lcom/bumptech/glide/MemoryCategory;->$values()[Lcom/bumptech/glide/MemoryCategory;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lcom/bumptech/glide/MemoryCategory;->$VALUES:[Lcom/bumptech/glide/MemoryCategory;

    .line 53
    .line 54
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/bumptech/glide/MemoryCategory;->multiplier:F

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bumptech/glide/MemoryCategory;
    .locals 1

    .line 1
    const-class v0, Lcom/bumptech/glide/MemoryCategory;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/bumptech/glide/MemoryCategory;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/bumptech/glide/MemoryCategory;
    .locals 1

    .line 1
    sget-object v0, Lcom/bumptech/glide/MemoryCategory;->$VALUES:[Lcom/bumptech/glide/MemoryCategory;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/bumptech/glide/MemoryCategory;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/bumptech/glide/MemoryCategory;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getMultiplier()F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bumptech/glide/MemoryCategory;->multiplier:F

    .line 2
    .line 3
    return p0
.end method
