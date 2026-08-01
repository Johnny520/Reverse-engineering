.class public final Lq80;
.super Lke;


# static fields
.field public static final c:Lq80;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lq80;

    .line 2
    .line 3
    invoke-direct {v0}, Lke;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq80;->c:Lq80;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Lge;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, Lxf;->d:Lxf;

    .line 2
    .line 3
    sget-object v0, Lx50;->h:Lv50;

    .line 4
    .line 5
    iget-object p1, p1, Lv10;->c:Lne;

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Lne;->b(Ljava/lang/Runnable;Lv50;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
