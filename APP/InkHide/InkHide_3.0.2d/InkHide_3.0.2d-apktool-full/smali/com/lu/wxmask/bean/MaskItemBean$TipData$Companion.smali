.class public final Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lu/wxmask/bean/MaskItemBean$TipData;
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
    invoke-direct {p0}, Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Lcom/lu/wxmask/bean/MaskItemBean;)Lcom/lu/wxmask/bean/MaskItemBean$TipData;
    .locals 2

    .line 1
    const-string v0, "wrapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/MaskItemBean;->getTipData()LT/o;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Lg0/a;->a(LT/o;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->getMess()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    const-string v1, "\u8be5\u7528\u6237\u5df2\u5bf9\u60a8\u79c1\u5bc6\uff08\u62c9\u9ed1\uff09\uff0c\u8bf7\u8054\u7cfb\u5bf9\u65b9\u89e3\u9664~"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->setMess(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    check-cast p1, Lcom/lu/wxmask/bean/MaskItemBean$TipData;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    return-object p1

    .line 31
    :catch_0
    new-instance p1, Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {p1, v1, v0, v1}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;ILN0/e;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method
