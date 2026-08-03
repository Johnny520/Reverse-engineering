.class public final Lw/s0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/n0;


# instance fields
.field public final a:Lfg/a;


# direct methods
.method public constructor <init>(Lfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/s0;->a:Lfg/a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final h(Lv1/p0;Ljava/util/List;J)Lv1/o0;
    .locals 2

    .line 1
    invoke-static {p3, p4}, Lu2/a;->h(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p3, p4}, Lu2/a;->g(J)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    new-instance p4, Lm/b;

    .line 10
    .line 11
    const/16 v1, 0x17

    .line 12
    .line 13
    invoke-direct {p4, p2, v1, p0}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object p2, Ltf/u;->g:Ltf/u;

    .line 17
    .line 18
    invoke-interface {p1, v0, p3, p2, p4}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
