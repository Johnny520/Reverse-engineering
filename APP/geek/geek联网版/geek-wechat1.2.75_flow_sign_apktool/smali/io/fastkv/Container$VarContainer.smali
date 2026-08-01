.class abstract Lio/fastkv/Container$VarContainer;
.super Lio/fastkv/Container$BaseContainer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/fastkv/Container;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "VarContainer"
.end annotation


# instance fields
.field external:Z

.field start:I

.field value:Ljava/lang/Object;

.field valueSize:I


# direct methods
.method public constructor <init>(IILjava/lang/Object;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/fastkv/Container$BaseContainer;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lio/fastkv/Container$VarContainer;->start:I

    .line 5
    .line 6
    iput p2, p0, Lio/fastkv/Container$BaseContainer;->offset:I

    .line 7
    .line 8
    iput-object p3, p0, Lio/fastkv/Container$VarContainer;->value:Ljava/lang/Object;

    .line 9
    .line 10
    iput p4, p0, Lio/fastkv/Container$VarContainer;->valueSize:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lio/fastkv/Container$VarContainer;->external:Z

    .line 13
    .line 14
    return-void
.end method
