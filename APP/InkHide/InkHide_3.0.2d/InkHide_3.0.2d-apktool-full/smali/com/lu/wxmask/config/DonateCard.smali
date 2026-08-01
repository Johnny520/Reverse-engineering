.class public final Lcom/lu/wxmask/config/DonateCard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation


# instance fields
.field private des:Ljava/lang/String;

.field private show:Z

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lu/wxmask/config/DonateCard;->des:Ljava/lang/String;

    .line 3
    iput-boolean p2, p0, Lcom/lu/wxmask/config/DonateCard;->show:Z

    .line 4
    iput-object p3, p0, Lcom/lu/wxmask/config/DonateCard;->title:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;ILN0/e;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/lu/wxmask/config/DonateCard;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final getDes()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/config/DonateCard;->des:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/lu/wxmask/config/DonateCard;->show:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/config/DonateCard;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setDes(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/config/DonateCard;->des:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setShow(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/lu/wxmask/config/DonateCard;->show:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/config/DonateCard;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
