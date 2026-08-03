.class public final Lk6/q;
.super Lh6/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lk6/p;


# instance fields
.field public final a:Lh6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk6/p;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lk6/p;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lk6/q;->b:Lk6/p;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lh6/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk6/q;->a:Lh6/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Lo6/a;Ljava/lang/Object;)V
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lo6/a;->l()Lo6/a;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lk6/q;->a:Lh6/f;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v2, Ln6/a;

    .line 17
    .line 18
    invoke-direct {v2, v0}, Ln6/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lh6/f;->b(Ln6/a;)Lh6/n;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Lk6/q;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p1}, Lo6/a;->c()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lo6/a;->h()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    invoke-virtual {v0, p1, p2}, Lh6/n;->b(Lo6/a;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
