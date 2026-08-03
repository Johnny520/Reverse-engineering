.class Lcom/tendcloud/tenddata/bb$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/bb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public key:Ljava/lang/Object;

.field public final synthetic this$0:Lcom/tendcloud/tenddata/bb;

.field public value:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/bb;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bb$b;->this$0:Lcom/tendcloud/tenddata/bb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/tendcloud/tenddata/bb$b;->key:Ljava/lang/Object;

    iput-object p3, p0, Lcom/tendcloud/tenddata/bb$b;->value:Ljava/lang/Object;

    return-void
.end method
