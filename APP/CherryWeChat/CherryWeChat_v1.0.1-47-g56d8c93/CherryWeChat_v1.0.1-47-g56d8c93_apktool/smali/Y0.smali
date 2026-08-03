.class public final LY0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:LRn;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(LRn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY0;->a:LRn;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LY0;->b:Ljava/util/ArrayList;

    return-void
.end method
