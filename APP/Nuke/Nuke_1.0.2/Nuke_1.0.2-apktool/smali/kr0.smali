.class public final Lkr0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lx00;


# static fields
.field public static final j:Lvf1;


# instance fields
.field public final h:Lir0;

.field public final i:Lq43;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lvf1;->d:Lo72;

    .line 2
    .line 3
    const-string v0, "application/json; charset=UTF-8"

    .line 4
    .line 5
    invoke-static {v0}, Lte;->C(Ljava/lang/String;)Lvf1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lkr0;->j:Lvf1;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lir0;Lq43;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkr0;->h:Lir0;

    .line 5
    .line 6
    iput-object p2, p0, Lkr0;->i:Lq43;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lfn;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/io/OutputStreamWriter;

    .line 7
    .line 8
    new-instance v2, Len;

    .line 9
    .line 10
    invoke-direct {v2, v0}, Len;-><init>(Lfn;)V

    .line 11
    .line 12
    .line 13
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lkr0;->h:Lir0;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lir0;->d(Ljava/io/Writer;)Lo41;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object p0, p0, Lkr0;->i:Lq43;

    .line 25
    .line 26
    invoke-virtual {p0, v1, p1}, Lq43;->c(Lo41;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lo41;->close()V

    .line 30
    .line 31
    .line 32
    iget-wide p0, v0, Lfn;->i:J

    .line 33
    .line 34
    invoke-virtual {v0, p0, p1}, Lfn;->f(J)Lno;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget p1, Lo82;->a:I

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance p1, Lm82;

    .line 44
    .line 45
    sget-object v0, Lkr0;->j:Lvf1;

    .line 46
    .line 47
    invoke-direct {p1, v0, p0}, Lm82;-><init>(Lvf1;Lno;)V

    .line 48
    .line 49
    .line 50
    return-object p1
.end method
