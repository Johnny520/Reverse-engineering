.class public abstract LB/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB/g;

.field public static final b:LB/g;

.field public static final c:LB/g;

.field public static final d:LB/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LB/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LB/g;-><init>(LB/f;Z)V

    sput-object v0, LB/h;->a:LB/g;

    new-instance v0, LB/g;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, LB/g;-><init>(LB/f;Z)V

    sput-object v0, LB/h;->b:LB/g;

    new-instance v0, LB/g;

    sget-object v1, LB/f;->a:LB/f;

    invoke-direct {v0, v1, v2}, LB/g;-><init>(LB/f;Z)V

    sput-object v0, LB/h;->c:LB/g;

    new-instance v0, LB/g;

    invoke-direct {v0, v1, v3}, LB/g;-><init>(LB/f;Z)V

    sput-object v0, LB/h;->d:LB/g;

    return-void
.end method
