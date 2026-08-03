.class public final Lk6/b;
.super Lh6/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final b:Lk6/a;


# instance fields
.field public final a:Lk6/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lk6/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lk6/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk6/b;->b:Lk6/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lh6/f;Lh6/n;Ljava/lang/Class;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk6/y;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p3}, Lk6/y;-><init>(Lh6/f;Lh6/n;Ljava/lang/reflect/Type;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lk6/b;->a:Lk6/y;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(Lo6/a;Ljava/lang/Object;)V
    .locals 4

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
    invoke-virtual {p1}, Lo6/a;->b()V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_1

    .line 16
    .line 17
    invoke-static {p2, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, p0, Lk6/b;->a:Lk6/y;

    .line 22
    .line 23
    invoke-virtual {v3, p1, v2}, Lk6/y;->b(Lo6/a;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p1}, Lo6/a;->g()V

    .line 30
    .line 31
    .line 32
    return-void
.end method
