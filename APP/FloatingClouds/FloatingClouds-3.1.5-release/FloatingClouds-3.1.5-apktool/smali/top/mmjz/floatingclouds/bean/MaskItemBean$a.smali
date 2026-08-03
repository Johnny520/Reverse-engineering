.class public final Ltop/mmjz/floatingclouds/bean/MaskItemBean$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/mmjz/floatingclouds/bean/MaskItemBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Ljava/lang/String;)Ltop/mmjz/floatingclouds/bean/MaskItemBean;
    .locals 8

    const-string v0, "jsonText"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    const-string p0, "maskId"

    const-string v1, ""

    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p0, "optString(...)"

    invoke-static {v3, p0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tagName"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "tipMode"

    const/16 v2, 0x2766

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    :try_start_1
    new-instance v1, Lorg/json/JSONObject;

    const-string v2, "tipData"

    const-string v6, "{}"

    invoke-virtual {v0, v2, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    move-object v6, v1

    goto :goto_2

    :catch_1
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    goto :goto_1

    :goto_2
    const-string v1, "mapId"

    const-string v2, "filehelper"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p0}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ltop/mmjz/floatingclouds/bean/MaskItemBean;

    invoke-direct/range {v2 .. v7}, Ltop/mmjz/floatingclouds/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;)V

    return-object v2
.end method
