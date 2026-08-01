.class public final Lcom/lu/wxmask/config/AppConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lc/a;
.end annotation


# instance fields
.field private mainUi:Lcom/lu/wxmask/config/MainUi;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/lu/wxmask/config/AppConfig;-><init>(Lcom/lu/wxmask/config/MainUi;)V

    return-void
.end method

.method public constructor <init>(Lcom/lu/wxmask/config/MainUi;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/lu/wxmask/config/AppConfig;->mainUi:Lcom/lu/wxmask/config/MainUi;

    return-void
.end method


# virtual methods
.method public final getMainUi()Lcom/lu/wxmask/config/MainUi;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/lu/wxmask/config/AppConfig;->mainUi:Lcom/lu/wxmask/config/MainUi;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setMainUi(Lcom/lu/wxmask/config/MainUi;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lu/wxmask/config/AppConfig;->mainUi:Lcom/lu/wxmask/config/MainUi;

    .line 2
    .line 3
    return-void
.end method
