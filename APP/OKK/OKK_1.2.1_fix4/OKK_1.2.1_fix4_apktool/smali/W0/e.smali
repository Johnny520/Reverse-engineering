.class public final LW0/e;
.super LQ0/h;
.source "SourceFile"

# interfaces
.implements LP0/a;


# instance fields
.field public final synthetic a:LW0/g;

.field public final synthetic b:Ljava/lang/CharSequence;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(LW0/g;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, LW0/e;->a:LW0/g;

    iput-object p2, p0, LW0/e;->b:Ljava/lang/CharSequence;

    iput p3, p0, LW0/e;->c:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LQ0/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LW0/e;->a:LW0/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "input"

    iget-object v2, p0, LW0/e;->b:Ljava/lang/CharSequence;

    invoke-static {v2, v1}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, LW0/g;->a:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    const-string v1, "matcher(...)"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget v1, p0, LW0/e;->c:I

    invoke-static {v0, v1, v2}, LU/S;->a(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)LW0/d;

    move-result-object v0

    return-object v0
.end method
