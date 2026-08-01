.class public final Lcom/lu/wxmask/bean/MaskItemBean;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/lu/wxmask/bean/MaskItemBean$Companion;,
        Lcom/lu/wxmask/bean/MaskItemBean$TipData;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/lu/wxmask/bean/MaskItemBean$Companion;


# instance fields
.field private avatarUrl:Ljava/lang/String;

.field private mapId:Ljava/lang/String;

.field private maskId:Ljava/lang/String;

.field private tagName:Ljava/lang/String;

.field private tipData:LT/o;

.field private tipMode:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/lu/wxmask/bean/MaskItemBean$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/lu/wxmask/bean/MaskItemBean$Companion;-><init>(LN0/e;)V

    sput-object v0, Lcom/lu/wxmask/bean/MaskItemBean;->Companion:Lcom/lu/wxmask/bean/MaskItemBean$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "maskId"

    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tagName"

    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapId"

    invoke-static {p5, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "avatarUrl"

    invoke-static {p6, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lu/wxmask/bean/MaskItemBean;->maskId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tagName:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tipMode:I

    .line 5
    iput-object p4, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tipData:LT/o;

    .line 6
    iput-object p5, p0, Lcom/lu/wxmask/bean/MaskItemBean;->mapId:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lcom/lu/wxmask/bean/MaskItemBean;->avatarUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;ILN0/e;)V
    .locals 1

    and-int/lit8 p8, p7, 0x2

    .line 8
    const-string v0, ""

    if-eqz p8, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_1

    const/16 p3, 0x2766

    :cond_1
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_2

    .line 9
    new-instance p4, LT/r;

    invoke-direct {p4}, LT/r;-><init>()V

    :cond_2
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_3

    .line 10
    const-string p5, "gh_e087bb5b95e6"

    :cond_3
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_4

    move-object p7, v0

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_4
    move-object p7, p6

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {p1 .. p7}, Lcom/lu/wxmask/bean/MaskItemBean;-><init>(Ljava/lang/String;Ljava/lang/String;ILT/o;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getAvatarUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/MaskItemBean;->avatarUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMapId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/MaskItemBean;->mapId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMaskId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/MaskItemBean;->maskId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTagName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tagName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTipData()LT/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tipData:LT/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTipMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tipMode:I

    .line 2
    .line 3
    return v0
.end method

.method public final setAvatarUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/MaskItemBean;->avatarUrl:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setMapId(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/MaskItemBean;->mapId:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setMaskId(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/MaskItemBean;->maskId:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setTagName(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tagName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setTipData(LT/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tipData:LT/o;

    .line 2
    .line 3
    return-void
.end method

.method public final setTipMode(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/lu/wxmask/bean/MaskItemBean;->tipMode:I

    .line 2
    .line 3
    return-void
.end method
