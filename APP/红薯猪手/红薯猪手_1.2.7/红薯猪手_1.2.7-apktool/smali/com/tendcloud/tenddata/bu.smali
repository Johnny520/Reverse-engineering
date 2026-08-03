.class public Lcom/tendcloud/tenddata/bu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/bu$a;
    }
.end annotation


# instance fields
.field public a:Lcom/tendcloud/tenddata/a;

.field public b:Lcom/tendcloud/tenddata/bu$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tendcloud/tenddata/bu;->a:Lcom/tendcloud/tenddata/a;

    sget-object v0, Lcom/tendcloud/tenddata/bu$a;->IMMEDIATELY:Lcom/tendcloud/tenddata/bu$a;

    iput-object v0, p0, Lcom/tendcloud/tenddata/bu;->b:Lcom/tendcloud/tenddata/bu$a;

    return-void
.end method
