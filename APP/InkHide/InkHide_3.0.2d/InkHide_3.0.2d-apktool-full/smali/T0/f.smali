.class public final LT0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/h;


# instance fields
.field public final a:LT0/h;

.field public final b:Z

.field public final c:LM0/l;


# direct methods
.method public constructor <init>(LT0/h;ZLM0/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT0/f;->a:LT0/h;

    .line 5
    .line 6
    iput-boolean p2, p0, LT0/f;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, LT0/f;->c:LM0/l;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LT0/e;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LT0/e;-><init>(LT0/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
