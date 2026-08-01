.class public abstract Lc01;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Le01;

.field public static final b:Le01;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Le01;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lm7;->D:Lm7;

    .line 5
    .line 6
    const-string v3, "TestTagsAsResourceId"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Le01;-><init>(Ljava/lang/String;ZLww;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lc01;->a:Le01;

    .line 12
    .line 13
    sget-object v0, Lm7;->C:Lm7;

    .line 14
    .line 15
    new-instance v1, Le01;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const-string v3, "AccessibilityClassName"

    .line 19
    .line 20
    invoke-direct {v1, v3, v2, v0}, Le01;-><init>(Ljava/lang/String;ZLww;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lc01;->b:Le01;

    .line 24
    .line 25
    return-void
.end method
