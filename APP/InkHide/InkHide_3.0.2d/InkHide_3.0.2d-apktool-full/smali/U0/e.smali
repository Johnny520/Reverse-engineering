.class public final LU0/e;
.super LN0/h;
.source "SourceFile"

# interfaces
.implements LM0/a;


# instance fields
.field public final synthetic a:LU0/g;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LU0/g;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU0/e;->a:LU0/g;

    .line 5
    .line 6
    iput-object p2, p0, LU0/e;->b:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LU0/e;->a:LU0/g;

    .line 2
    .line 3
    iget-object v1, p0, LU0/e;->b:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v2, v1}, LU0/g;->b(ILjava/lang/String;)LU0/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method
