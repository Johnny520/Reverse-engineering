.class public final Lm20;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic a:Lgg;


# direct methods
.method public constructor <init>(Lgg;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm20;->a:Lgg;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lfg;

    .line 2
    .line 3
    iget-object v1, p0, Lm20;->a:Lgg;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lfg;-><init>(Lgg;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
