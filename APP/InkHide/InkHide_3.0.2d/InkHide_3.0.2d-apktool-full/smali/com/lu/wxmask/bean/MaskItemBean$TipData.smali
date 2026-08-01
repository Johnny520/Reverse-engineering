.class public final Lcom/lu/wxmask/bean/MaskItemBean$TipData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lu/wxmask/bean/MaskItemBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TipData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;


# instance fields
.field private mess:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;-><init>(LN0/e;)V

    sput-object v0, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->Companion:Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;ILN0/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "mess"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->mess:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILN0/e;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    const-string p1, "\u8be5\u7528\u6237\u5df2\u5bf9\u60a8\u79c1\u5bc6\uff08\u62c9\u9ed1\uff09\uff0c\u8bf7\u8054\u7cfb\u5bf9\u65b9\u89e3\u9664~"

    :cond_0
    invoke-direct {p0, p1}, Lcom/lu/wxmask/bean/MaskItemBean$TipData;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static final from(Lcom/lu/wxmask/bean/MaskItemBean;)Lcom/lu/wxmask/bean/MaskItemBean$TipData;
    .locals 1

    sget-object v0, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->Companion:Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;

    invoke-virtual {v0, p0}, Lcom/lu/wxmask/bean/MaskItemBean$TipData$Companion;->from(Lcom/lu/wxmask/bean/MaskItemBean;)Lcom/lu/wxmask/bean/MaskItemBean$TipData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getMess()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->mess:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setMess(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/MaskItemBean$TipData;->mess:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
