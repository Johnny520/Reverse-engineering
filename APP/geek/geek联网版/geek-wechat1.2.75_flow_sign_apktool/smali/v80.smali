.class public final Lv80;
.super Lle;


# static fields
.field public static final c:Lv80;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lv80;

    .line 2
    .line 3
    invoke-direct {v0}, Lle;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv80;->c:Lv80;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Lhe;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object p1, Lyf;->d:Lyf;

    .line 2
    .line 3
    sget-object v0, Ld60;->h:Lb60;

    .line 4
    .line 5
    iget-object p1, p1, Lc20;->c:Loe;

    .line 6
    .line 7
    invoke-virtual {p1, p2, v0}, Loe;->b(Ljava/lang/Runnable;Lb60;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
