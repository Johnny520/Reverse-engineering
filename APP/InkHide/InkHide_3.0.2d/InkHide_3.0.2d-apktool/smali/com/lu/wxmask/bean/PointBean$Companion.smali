.class public final Lcom/lu/wxmask/bean/PointBean$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lu/wxmask/bean/PointBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LN0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/lu/wxmask/bean/PointBean$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lcom/lu/wxmask/bean/PointBean;
    .locals 4

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "featId"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "clazz"

    .line 14
    .line 15
    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "method"

    .line 20
    .line 21
    invoke-virtual {p1, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance v1, Lcom/lu/wxmask/bean/PointBean;

    .line 26
    .line 27
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, LN0/g;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, LN0/g;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v0, v2, p1}, Lcom/lu/wxmask/bean/PointBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method
