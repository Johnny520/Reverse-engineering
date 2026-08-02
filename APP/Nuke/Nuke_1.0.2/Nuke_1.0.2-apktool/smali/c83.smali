.class public final Lc83;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw41;


# static fields
.field public static final b:Lc83;


# instance fields
.field public final synthetic a:Lls1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lc83;

    .line 2
    .line 3
    invoke-direct {v0}, Lc83;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lc83;->b:Lc83;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lls1;

    .line 5
    .line 6
    invoke-direct {v0}, Lls1;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lc83;->a:Lls1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ly40;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lc83;->a:Lls1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lls1;->a(Ly40;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, La83;->a:La83;

    .line 7
    .line 8
    return-object p0
.end method

.method public final d(Lve0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, La83;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lc83;->a:Lls1;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lls1;->d(Lve0;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e()Lyo2;
    .locals 0

    .line 1
    iget-object p0, p0, Lc83;->a:Lls1;

    .line 2
    .line 3
    invoke-virtual {p0}, Lls1;->e()Lyo2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
