.class public abstract Lwn2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lyn2;

.field public static final b:Lyn2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyn2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lun2;->n:Lun2;

    .line 5
    .line 6
    const-string v3, "TestTagsAsResourceId"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lyn2;-><init>(Ljava/lang/String;ZLmn0;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lwn2;->a:Lyn2;

    .line 12
    .line 13
    sget-object v0, Lun2;->m:Lun2;

    .line 14
    .line 15
    new-instance v1, Lyn2;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const-string v3, "AccessibilityClassName"

    .line 19
    .line 20
    invoke-direct {v1, v3, v2, v0}, Lyn2;-><init>(Ljava/lang/String;ZLmn0;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lwn2;->b:Lyn2;

    .line 24
    .line 25
    return-void
.end method
