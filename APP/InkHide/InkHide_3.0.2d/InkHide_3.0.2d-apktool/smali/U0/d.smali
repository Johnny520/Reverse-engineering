.class public final LU0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/regex/Matcher;

.field public final b:Ljava/lang/String;

.field public c:LU0/c;


# direct methods
.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p2, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LU0/d;->a:Ljava/util/regex/Matcher;

    .line 10
    .line 11
    iput-object p2, p0, LU0/d;->b:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LU0/d;->c:LU0/c;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LU0/c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LU0/c;-><init>(LU0/d;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LU0/d;->c:LU0/c;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LU0/d;->c:LU0/c;

    .line 13
    .line 14
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
