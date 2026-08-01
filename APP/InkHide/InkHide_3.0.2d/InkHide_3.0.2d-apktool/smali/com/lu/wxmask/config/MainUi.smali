.class public final Lcom/lu/wxmask/config/MainUi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation


# instance fields
.field private donateCard:Lcom/lu/wxmask/config/DonateCard;

.field private moduleCard:Lcom/lu/wxmask/config/ModuleCard;


# direct methods
.method public constructor <init>(Lcom/lu/wxmask/config/DonateCard;Lcom/lu/wxmask/config/ModuleCard;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/lu/wxmask/config/MainUi;->donateCard:Lcom/lu/wxmask/config/DonateCard;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/lu/wxmask/config/MainUi;->moduleCard:Lcom/lu/wxmask/config/ModuleCard;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getDonateCard()Lcom/lu/wxmask/config/DonateCard;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/config/MainUi;->donateCard:Lcom/lu/wxmask/config/DonateCard;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getModuleCard()Lcom/lu/wxmask/config/ModuleCard;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/config/MainUi;->moduleCard:Lcom/lu/wxmask/config/ModuleCard;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setDonateCard(Lcom/lu/wxmask/config/DonateCard;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/config/MainUi;->donateCard:Lcom/lu/wxmask/config/DonateCard;

    .line 2
    .line 3
    return-void
.end method

.method public final setModuleCard(Lcom/lu/wxmask/config/ModuleCard;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/config/MainUi;->moduleCard:Lcom/lu/wxmask/config/ModuleCard;

    .line 2
    .line 3
    return-void
.end method
