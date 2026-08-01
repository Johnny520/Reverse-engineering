.class public final LJ/a;
.super LJ/b;
.source "SourceFile"


# static fields
.field public static final b:LJ/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ/a;

    .line 2
    .line 3
    invoke-direct {v0}, LJ/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ/a;->b:LJ/a;

    .line 7
    .line 8
    return-void
.end method
