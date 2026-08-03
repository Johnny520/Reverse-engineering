.class public final LPh;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:LPg;


# instance fields
.field public final a:Lof;

.field public b:I

.field public final c:LRc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LPg;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, LPg;-><init>(I)V

    sput-object v0, LPh;->d:LPg;

    return-void
.end method

.method public constructor <init>(Lof;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LPh;->b:I

    new-instance v0, LRc;

    invoke-direct {v0}, LRc;-><init>()V

    iput-object v0, p0, LPh;->c:LRc;

    iput-object p1, p0, LPh;->a:Lof;

    return-void
.end method
