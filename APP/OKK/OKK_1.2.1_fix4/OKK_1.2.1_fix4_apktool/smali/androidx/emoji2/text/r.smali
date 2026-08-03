.class public final Landroidx/emoji2/text/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lx0/e;


# instance fields
.field public final a:Landroidx/emoji2/text/i;

.field public b:I

.field public final c:Landroidx/emoji2/text/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx0/e;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lx0/e;-><init>(I)V

    sput-object v0, Landroidx/emoji2/text/r;->d:Lx0/e;

    return-void
.end method

.method public constructor <init>(Landroidx/emoji2/text/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/r;->b:I

    new-instance v0, Landroidx/emoji2/text/d;

    invoke-direct {v0}, Landroidx/emoji2/text/d;-><init>()V

    iput-object v0, p0, Landroidx/emoji2/text/r;->c:Landroidx/emoji2/text/d;

    iput-object p1, p0, Landroidx/emoji2/text/r;->a:Landroidx/emoji2/text/i;

    return-void
.end method
