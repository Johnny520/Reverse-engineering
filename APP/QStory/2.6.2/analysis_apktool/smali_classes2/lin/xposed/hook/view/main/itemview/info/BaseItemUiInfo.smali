.class public abstract Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field protected paths:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->paths:[Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getItemName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->paths:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    add-int/lit8 v0, v0, -0x1

    .line 5
    .line 6
    aget-object p0, p0, v0

    .line 7
    .line 8
    return-object p0
.end method

.method public final getType()I
    .locals 2

    .line 1
    iget-object p0, p0, Llin/xposed/hook/view/main/itemview/info/BaseItemUiInfo;->paths:[Ljava/lang/String;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    const/4 v0, 0x4

    .line 5
    const/4 v1, 0x0

    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x3

    .line 10
    if-ne p0, v0, :cond_1

    .line 11
    .line 12
    return v1

    .line 13
    :cond_1
    const/4 v0, 0x2

    .line 14
    const/4 v1, 0x1

    .line 15
    if-ne p0, v0, :cond_2

    .line 16
    .line 17
    return v1

    .line 18
    :cond_2
    if-ne p0, v1, :cond_3

    .line 19
    .line 20
    const/4 p0, -0x1

    .line 21
    return p0

    .line 22
    :cond_3
    const/4 p0, -0x2

    .line 23
    return p0
.end method
