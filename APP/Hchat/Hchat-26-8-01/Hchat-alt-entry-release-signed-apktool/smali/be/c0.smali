.class public final synthetic Lbe/c0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/UnaryOperator;


# instance fields
.field public final synthetic a:Lbe/d0;

.field public final synthetic b:Lud/e;


# direct methods
.method public synthetic constructor <init>(Lbe/d0;Lud/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbe/c0;->a:Lbe/d0;

    .line 5
    .line 6
    iput-object p2, p0, Lbe/c0;->b:Lud/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lbe/c0;->b:Lud/e;

    .line 2
    .line 3
    check-cast p1, Lnc/a;

    .line 4
    .line 5
    iget-object v1, p0, Lbe/c0;->a:Lbe/d0;

    .line 6
    .line 7
    invoke-virtual {v1, v0, p1}, Lbe/d0;->l(Lud/e;Lnc/a;)Lnc/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
