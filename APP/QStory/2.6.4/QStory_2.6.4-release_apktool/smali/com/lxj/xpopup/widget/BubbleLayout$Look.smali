.class public final enum Lcom/lxj/xpopup/widget/BubbleLayout$Look;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lxj/xpopup/widget/BubbleLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Look"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/lxj/xpopup/widget/BubbleLayout$Look;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/lxj/xpopup/widget/BubbleLayout$Look;

.field public static final enum BOTTOM:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

.field public static final enum LEFT:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

.field public static final enum RIGHT:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

.field public static final enum TOP:Lcom/lxj/xpopup/widget/BubbleLayout$Look;


# instance fields
.field value:I


# direct methods
.method private static synthetic $values()[Lcom/lxj/xpopup/widget/BubbleLayout$Look;
    .locals 4

    .line 1
    sget-object v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->LEFT:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 2
    .line 3
    sget-object v1, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->TOP:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 4
    .line 5
    sget-object v2, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->RIGHT:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 6
    .line 7
    sget-object v3, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->BOTTOM:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/lxj/xpopup/widget/BubbleLayout$Look;

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
    new-instance v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 2
    .line 3
    const-string v1, "LEFT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lcom/lxj/xpopup/widget/BubbleLayout$Look;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->LEFT:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 11
    .line 12
    new-instance v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 13
    .line 14
    const-string v1, "TOP"

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v0, v1, v3, v2}, Lcom/lxj/xpopup/widget/BubbleLayout$Look;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->TOP:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 21
    .line 22
    new-instance v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 23
    .line 24
    const-string v1, "RIGHT"

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    invoke-direct {v0, v1, v2, v3}, Lcom/lxj/xpopup/widget/BubbleLayout$Look;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->RIGHT:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 31
    .line 32
    new-instance v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 33
    .line 34
    const-string v1, "BOTTOM"

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    invoke-direct {v0, v1, v3, v2}, Lcom/lxj/xpopup/widget/BubbleLayout$Look;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->BOTTOM:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 41
    .line 42
    invoke-static {}, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->$values()[Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->$VALUES:[Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 47
    .line 48
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static getType(I)Lcom/lxj/xpopup/widget/BubbleLayout$Look;
    .locals 2

    .line 1
    sget-object v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->BOTTOM:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq p0, v1, :cond_2

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p0, v1, :cond_1

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq p0, v1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    sget-object p0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->RIGHT:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    sget-object p0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->TOP:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_2
    sget-object p0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->LEFT:Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 20
    .line 21
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/lxj/xpopup/widget/BubbleLayout$Look;
    .locals 1

    .line 1
    const-class v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/lxj/xpopup/widget/BubbleLayout$Look;
    .locals 1

    .line 1
    sget-object v0, Lcom/lxj/xpopup/widget/BubbleLayout$Look;->$VALUES:[Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/lxj/xpopup/widget/BubbleLayout$Look;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/lxj/xpopup/widget/BubbleLayout$Look;

    .line 8
    .line 9
    return-object v0
.end method
