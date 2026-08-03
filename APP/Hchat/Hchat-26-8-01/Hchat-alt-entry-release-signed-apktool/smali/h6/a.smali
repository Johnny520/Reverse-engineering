.class public final Lh6/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Lh6/a;

.field public static final e:Lh6/a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lh6/a;

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v1, v2}, Lh6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lh6/a;->d:Lh6/a;

    .line 10
    .line 11
    new-instance v0, Lh6/a;

    .line 12
    .line 13
    const-string v1, "  "

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "\n"

    .line 17
    .line 18
    invoke-direct {v0, v3, v1, v2}, Lh6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lh6/a;->e:Lh6/a;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "[\r\n]*"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v0, "[ \t]*"

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iput-object p1, p0, Lh6/a;->a:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p2, p0, Lh6/a;->b:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean p3, p0, Lh6/a;->c:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p1, "Only combinations of spaces and tabs are allowed in indent."

    .line 28
    .line 29
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    throw p1

    .line 34
    :cond_1
    const-string p1, "Only combinations of \\n and \\r are allowed in newline."

    .line 35
    .line 36
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    throw p1
.end method
