.class public final Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build La/s9;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/mmjz/floatingclouds/bean/MaskItemBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TipData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\u0005\u00a8\u0006\u000c"
    }
    d2 = {
        "Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;",
        "",
        "",
        "mess",
        "<init>",
        "(Ljava/lang/String;)V",
        "Ljava/lang/String;",
        "getMess",
        "()Ljava/lang/String;",
        "setMess",
        "Companion",
        "a",
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
.field public static final Companion:Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData$a;


# instance fields
.field private mess:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData$a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;->Companion:Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;ILa/O4;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "mess"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;->mess:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILa/O4;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    const-string p1, "\u8be5\u7528\u6237\u5df2\u5bf9\u60a8\u79c1\u5bc6\uff08\u62c9\u9ed1\uff09\uff0c\u8bf7\u8054\u7cfb\u5bf9\u65b9\u89e3\u9664~"

    :cond_0
    invoke-direct {p0, p1}, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static final from(Ltop/mmjz/floatingclouds/bean/MaskItemBean;)Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;
    .locals 4

    sget-object v0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;->Companion:Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData$a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "wrapper"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;->getTipData()Lorg/json/JSONObject;

    move-result-object p0

    if-nez p0, :cond_0

    new-instance p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;

    invoke-direct {p0, v1, v0, v1}, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;ILa/O4;)V

    return-object p0

    :cond_0
    const-string v2, "mess"

    const-string v3, ""

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    const-string p0, "\u8be5\u7528\u6237\u5df2\u5bf9\u60a8\u79c1\u5bc6\uff08\u62c9\u9ed1\uff09\uff0c\u8bf7\u8054\u7cfb\u5bf9\u65b9\u89e3\u9664~"

    :cond_1
    new-instance v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;

    invoke-direct {v2, p0}, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    new-instance p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;

    invoke-direct {p0, v1, v0, v1}, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;ILa/O4;)V

    return-object p0
.end method


# virtual methods
.method public final getMess()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;->mess:Ljava/lang/String;

    return-object v0
.end method

.method public final setMess(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;->mess:Ljava/lang/String;

    return-void
.end method
