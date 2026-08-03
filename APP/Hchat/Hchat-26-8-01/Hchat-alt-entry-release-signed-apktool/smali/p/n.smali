.class public final Lp/n;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv1/n0;


# static fields
.field public static final b:Lp/n;

.field public static final c:Lp/n;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp/n;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lp/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lp/n;->b:Lp/n;

    .line 8
    .line 9
    new-instance v0, Lp/n;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lp/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lp/n;->c:Lp/n;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp/n;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final h(Lv1/p0;Ljava/util/List;J)Lv1/o0;
    .locals 2

    .line 1
    iget p2, p0, Lp/n;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p3, p4}, Lu2/a;->f(J)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-static {p3, p4}, Lu2/a;->h(J)I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move p2, v0

    .line 19
    :goto_0
    invoke-static {p3, p4}, Lu2/a;->e(J)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-static {p3, p4}, Lu2/a;->g(J)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    :cond_1
    new-instance p3, Li2/z;

    .line 30
    .line 31
    const/16 p4, 0xe

    .line 32
    .line 33
    invoke-direct {p3, p4}, Li2/z;-><init>(I)V

    .line 34
    .line 35
    .line 36
    sget-object p4, Ltf/u;->g:Ltf/u;

    .line 37
    .line 38
    invoke-interface {p1, p2, v0, p4, p3}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :pswitch_0
    invoke-static {p3, p4}, Lu2/a;->j(J)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p3, p4}, Lu2/a;->i(J)I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    new-instance p4, Li2/z;

    .line 52
    .line 53
    const/16 v0, 0xe

    .line 54
    .line 55
    invoke-direct {p4, v0}, Li2/z;-><init>(I)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 59
    .line 60
    invoke-interface {p1, p2, p3, v0, p4}, Lv1/p0;->z(IILjava/util/Map;Lfg/l;)Lv1/o0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    return-object p1

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
