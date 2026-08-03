.class public final synthetic Lbe/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/IntFunction;


# instance fields
.field public final synthetic a:Lnd/i;

.field public final synthetic b:Lpd/s;


# direct methods
.method public synthetic constructor <init>(Lnd/i;Lpd/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbe/t;->a:Lnd/i;

    .line 5
    .line 6
    iput-object p2, p0, Lbe/t;->b:Lpd/s;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lbe/t;->b:Lpd/s;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lpd/s;->k0(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lbe/t;->a:Lnd/i;

    .line 8
    .line 9
    iget-object v0, v0, Lnd/i;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
