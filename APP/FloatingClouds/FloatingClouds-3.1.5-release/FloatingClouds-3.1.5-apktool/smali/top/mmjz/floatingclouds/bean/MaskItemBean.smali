.class public final Ltop/mmjz/floatingclouds/bean/MaskItemBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build La/s9;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/mmjz/floatingclouds/bean/MaskItemBean$a;,
        Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"#B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000f\"\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0004\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u000f\"\u0004\u0008\u0015\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR$\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\u001b\u001a\u0004\u0008\u001c\u0010\r\"\u0004\u0008\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u0010\u001a\u0004\u0008\u001f\u0010\u000f\"\u0004\u0008 \u0010\u0013\u00a8\u0006$"
    }
    d2 = {
        "Ltop/mmjz/floatingclouds/bean/MaskItemBean;",
        "",
        "",
        "maskId",
        "tagName",
        "",
        "tipMode",
        "Lorg/json/JSONObject;",
        "tipData",
        "mapId",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;)V",
        "toJSONObject",
        "()Lorg/json/JSONObject;",
        "toJson",
        "()Ljava/lang/String;",
        "Ljava/lang/String;",
        "getMaskId",
        "setMaskId",
        "(Ljava/lang/String;)V",
        "getTagName",
        "setTagName",
        "I",
        "getTipMode",
        "()I",
        "setTipMode",
        "(I)V",
        "Lorg/json/JSONObject;",
        "getTipData",
        "setTipData",
        "(Lorg/json/JSONObject;)V",
        "getMapId",
        "setMapId",
        "Companion",
        "a",
        "TipData",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Ltop/mmjz/floatingclouds/bean/MaskItemBean$a;


# instance fields
.field private mapId:Ljava/lang/String;

.field private maskId:Ljava/lang/String;

.field private tagName:Ljava/lang/String;

.field private tipData:Lorg/json/JSONObject;

.field private tipMode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->Companion:Ltop/mmjz/floatingclouds/bean/MaskItemBean$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;)V
    .locals 1

    const-string v0, "maskId"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tagName"

    invoke-static {p2, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapId"

    invoke-static {p5, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->maskId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tagName:Ljava/lang/String;

    .line 4
    iput p3, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tipMode:I

    .line 5
    iput-object p4, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tipData:Lorg/json/JSONObject;

    .line 6
    iput-object p5, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->mapId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;ILa/O4;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 7
    const-string p2, ""

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/16 p3, 0x2766

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 8
    new-instance p4, Lorg/json/JSONObject;

    invoke-direct {p4}, Lorg/json/JSONObject;-><init>()V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    .line 9
    const-string p5, "filehelper"

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    .line 10
    invoke-direct/range {v0 .. v5}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getMapId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->mapId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMaskId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->maskId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTagName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tagName:Ljava/lang/String;

    return-object v0
.end method

.method public final getTipData()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tipData:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final getTipMode()I
    .locals 1

    iget v0, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tipMode:I

    return v0
.end method

.method public final setMapId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->mapId:Ljava/lang/String;

    return-void
.end method

.method public final setMaskId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->maskId:Ljava/lang/String;

    return-void
.end method

.method public final setTagName(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tagName:Ljava/lang/String;

    return-void
.end method

.method public final setTipData(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tipData:Lorg/json/JSONObject;

    return-void
.end method

.method public final setTipMode(I)V
    .locals 0

    iput p1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tipMode:I

    return-void
.end method

.method public final toJSONObject()Lorg/json/JSONObject;
    .locals 3

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "maskId"

    iget-object v2, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->maskId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "tagName"

    iget-object v2, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tagName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "tipMode"

    iget v2, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tipMode:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->tipData:Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, "{}"

    :cond_1
    const-string v2, "tipData"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "mapId"

    iget-object v2, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->mapId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-object v0
.end method

.method public final toJson()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
