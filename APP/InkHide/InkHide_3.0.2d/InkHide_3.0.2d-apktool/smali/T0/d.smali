.class public final LT0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT0/h;
.implements LT0/c;


# static fields
.field public static final a:LT0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LT0/d;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LT0/d;->a:LT0/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()LT0/h;
    .locals 1

    .line 1
    sget-object v0, LT0/d;->a:LT0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    sget-object v0, LF0/r;->a:LF0/r;

    .line 2
    .line 3
    return-object v0
.end method
