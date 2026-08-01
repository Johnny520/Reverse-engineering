.class public abstract Lgs1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lis1;

.field public static final β:Lis1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lis1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lui;->Δ:Lui;

    .line 5
    .line 6
    const-string v3, "TestTagsAsResourceId"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lis1;-><init>(Ljava/lang/String;ZLe80;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lgs1;->α:Lis1;

    .line 12
    .line 13
    sget-object v0, Lui;->Γ:Lui;

    .line 14
    .line 15
    new-instance v1, Lis1;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const-string v3, "AccessibilityClassName"

    .line 19
    .line 20
    invoke-direct {v1, v3, v2, v0}, Lis1;-><init>(Ljava/lang/String;ZLe80;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lgs1;->β:Lis1;

    .line 24
    .line 25
    return-void
.end method
