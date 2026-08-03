.class Lcom/tendcloud/tenddata/az$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/az;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public fp1:Lcom/tendcloud/tenddata/az$c;

.field public fp2:Lcom/tendcloud/tenddata/az$c;

.field public score:D

.field public final synthetic this$0:Lcom/tendcloud/tenddata/az;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/az;Lcom/tendcloud/tenddata/az$c;Lcom/tendcloud/tenddata/az$c;D)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/az$d;->this$0:Lcom/tendcloud/tenddata/az;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/tendcloud/tenddata/az$d;->fp1:Lcom/tendcloud/tenddata/az$c;

    iput-object p3, p0, Lcom/tendcloud/tenddata/az$d;->fp2:Lcom/tendcloud/tenddata/az$c;

    iput-wide p4, p0, Lcom/tendcloud/tenddata/az$d;->score:D

    return-void
.end method
