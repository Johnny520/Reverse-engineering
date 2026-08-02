.class public final Lvp0;
.super Landroid/content/ContextWrapper;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final k:Lto0;


# instance fields
.field public final a:Ltd1;

.field public final b:Laf0;

.field public final c:Lz8;

.field public final d:Leb;

.field public final e:Ljava/util/List;

.field public final f:Lhg;

.field public final g:Lbf0;

.field public final h:Ln4;

.field public final i:I

.field public j:Lz82;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lto0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lrn1;->a:Li51;

    .line 7
    .line 8
    iput-object v1, v0, Lto0;->h:Li51;

    .line 9
    .line 10
    sput-object v0, Lvp0;->k:Lto0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ltd1;Ler2;Lz8;Leb;Lhg;Ljava/util/List;Lbf0;Ln4;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lvp0;->a:Ltd1;

    .line 9
    .line 10
    iput-object p4, p0, Lvp0;->c:Lz8;

    .line 11
    .line 12
    iput-object p5, p0, Lvp0;->d:Leb;

    .line 13
    .line 14
    iput-object p7, p0, Lvp0;->e:Ljava/util/List;

    .line 15
    .line 16
    iput-object p6, p0, Lvp0;->f:Lhg;

    .line 17
    .line 18
    iput-object p8, p0, Lvp0;->g:Lbf0;

    .line 19
    .line 20
    iput-object p9, p0, Lvp0;->h:Ln4;

    .line 21
    .line 22
    const/4 p1, 0x4

    .line 23
    iput p1, p0, Lvp0;->i:I

    .line 24
    .line 25
    new-instance p1, Laf0;

    .line 26
    .line 27
    invoke-direct {p1, p3}, Laf0;-><init>(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lvp0;->b:Laf0;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()Lv72;
    .locals 0

    .line 1
    iget-object p0, p0, Lvp0;->b:Laf0;

    .line 2
    .line 3
    invoke-virtual {p0}, Laf0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv72;

    .line 8
    .line 9
    return-object p0
.end method
