.class public final LW0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/regex/Matcher;

.field public final b:Ljava/lang/CharSequence;

.field public c:LE0/z;


# direct methods
.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "input"

    invoke-static {p2, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW0/d;->a:Ljava/util/regex/Matcher;

    iput-object p2, p0, LW0/d;->b:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LW0/d;->c:LE0/z;

    if-nez v0, :cond_0

    new-instance v0, LE0/z;

    invoke-direct {v0, p0}, LE0/z;-><init>(LW0/d;)V

    iput-object v0, p0, LW0/d;->c:LE0/z;

    :cond_0
    iget-object v0, p0, LW0/d;->c:LE0/z;

    invoke-static {v0}, LQ0/g;->b(Ljava/lang/Object;)V

    return-object v0
.end method
