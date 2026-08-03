.class public final LQ/a;
.super LQ/b;
.source "SourceFile"


# static fields
.field public static final b:LQ/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LQ/a;

    invoke-direct {v0}, LQ/b;-><init>()V

    sput-object v0, LQ/a;->b:LQ/a;

    return-void
.end method
