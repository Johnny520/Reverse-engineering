.class public final Lvc3;
.super Lvj;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final d:Lvc3;

.field public static final e:Ljava/lang/String;

.field public static final f:Lvu2;

.field public static final g:Lz52;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lvc3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lvc3;->d:Lvc3;

    .line 8
    .line 9
    const-string v0, "WeChatScriptMessageHooker"

    .line 10
    .line 11
    sput-object v0, Lvc3;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Lvu2;

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-direct {v0, v1}, Lvu2;-><init>(I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lvc3;->f:Lvu2;

    .line 20
    .line 21
    new-instance v0, Lz52;

    .line 22
    .line 23
    invoke-direct {v0}, Lz52;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lvc3;->g:Lz52;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Lvc3;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(Lvb1;)V
    .locals 2

    .line 1
    sget-object p0, Lid3;->e:Lid3;

    .line 2
    .line 3
    new-instance v0, Lyb3;

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lyb3;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0, v0}, Lvb1;->a(Ltb1;Lin0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    sget-object p0, Lvc3;->g:Lz52;

    .line 2
    .line 3
    iget-object p0, p0, Lz52;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 6
    .line 7
    .line 8
    return-void
.end method
