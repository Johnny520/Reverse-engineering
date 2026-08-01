.class public final LT0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/h;
.implements LT0/c;


# instance fields
.field public final a:LT0/f;


# direct methods
.method public constructor <init>(LT0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT0/l;->a:LT0/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()LT0/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LF0/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LF0/c;-><init>(LT0/l;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
