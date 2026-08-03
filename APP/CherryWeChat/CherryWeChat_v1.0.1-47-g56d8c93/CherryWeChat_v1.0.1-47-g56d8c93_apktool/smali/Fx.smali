.class public final LFx;
.super LfG;
.source ""


# static fields
.field public static final g:LFx;

.field public static final h:LFx;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, LFx;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, LfG;-><init>(I)V

    sput-object v0, LFx;->g:LFx;

    new-instance v0, LFx;

    invoke-direct {v0, v1}, LfG;-><init>(I)V

    sput-object v0, LFx;->h:LFx;

    return-void
.end method
